package ua.com.alevel;
import ua.com.alevel.entitys.HumanEntity;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HumanEntity> people = new ArrayList<HumanEntity>();

        int peopleAmount = 6;

        for (int i=0; i < peopleAmount ; i++) {
            people.add(new HumanEntity());
        }
        for (int i = 0; i < people.size() ; i++) {
            if ( i != 0){
               HumanEntity currentUser = people.get(i);
               HumanEntity prevUser = people.get(i-1);

                System.out.println(" User " + (i + 1) + " shook the hand of the user " + i);

                currentUser.addFriendId(prevUser.getId());
               prevUser.addFriendId(currentUser.getId());
            }
        }
        for (int i = 0; i <people.size() ; i++) {
            HumanEntity pivotUser = people.get(i);

            for (int j = 0; j <people.size() ; j++) {
                HumanEntity currentUser = people.get(j);
                boolean isNotFriend = (!pivotUser.getFriendsIdList().contains(currentUser.getId()));
                boolean isNotSameUser = (pivotUser.getId() != currentUser.getId());
                boolean isNotIndirectFriend = !pivotUser.getIndirectFriendsIdList().contains(currentUser.getId());
                if (isNotFriend && isNotSameUser ){
                    if (isNotIndirectFriend){
                        System.out.println(" User " + (i + 1) + " became an indirect friend with the user " + (j + 1));
                    }
                    pivotUser.setIndirectFriendId(currentUser.getId());
                }
            }
        }
    }
}