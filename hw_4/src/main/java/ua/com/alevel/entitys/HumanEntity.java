package ua.com.alevel.entitys;

import java.util.ArrayList;
import java.util.UUID;

public class HumanEntity {

    private String id = UUID.randomUUID().toString();
    public String getId(){
        return id;
    }

    ArrayList<String> friendsIdList = new ArrayList<String>();
     public void addFriendId(String id){
         this.friendsIdList.add(id);
     }
     public ArrayList<String> getFriendsIdList(){
         return this.friendsIdList;
     }

    ArrayList<String> indirectFriendsIdList = new ArrayList<String>();
     public void setIndirectFriendId(String id){
        this.indirectFriendsIdList.add(id);
     }
     public ArrayList<String> getIndirectFriendsIdList(){
         return this.indirectFriendsIdList;
     }
}


