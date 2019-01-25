package com.company.hash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 17:03 2019/1/15
 * @Modified By:
 */
public class HashAlgorithm {
    private static final int Num_training_user = 0;
    public Vector TestDataVector;
    protected ArrayList DataList;
    protected Vector TrainDataVector;

    protected int Num_training_users;
    protected int Num_training_items;

    protected Hashtable users_items;
    protected Hashtable user_items;
    protected Hashtable items_users;
    protected Hashtable items_user;
    protected int[][] users_users;
    private int i;
    private Enumeration item_users_Key;

    public void readData() {
        DataList = new ArrayList();
        try {
            FileReader f = new FileReader("H://ml-100k//u.data");
            BufferedReader reader = new BufferedReader(f);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String item[] = line.split("");
                String last = item(item.length - 1);
                DataList.add(line);
            }
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String item(int i) {
        // TODO Auto-generated method stub
        return null;
    }


    private String RunningInstance(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    public void bulidUsersItemsTable() {
        Enumeration eles = TrainDataVector.elements();
        users_items = new Hashtable();
        eles = TrainDataVector.elements();
        while (eles.hasMoreElements()) {
            String ele = (String) eles.nextElement();
            String[] RunningInstance = ele.split("   ");
            String user = RunningInstance[0];
            String item = RunningInstance[1];
        }
        Object user = new Object();
        if (users_items.containsKey(user)) {
            Vector items = new Vector();
            items = (Vector) user_items.get(user);
            items.add(items);
            user_items.remove(user);
            user_items.get(items);
        } else {
            Vector items = new Vector();
            items.add(user);
            user_items.put(user, items);
        }
    }

    public void buildUsersItemsTable() {
        Enumeration eles = TrainDataVector.elements();
        items_users = new Hashtable();
        eles = TrainDataVector.elements();
        while (eles.hasMoreElements()) ;
        String els = (String) eles.nextElement();
        String[] RunningInstance = els.split("    ");
        String user = RunningInstance[0];
        String item = RunningInstance[1];

        if (items_users.containsKey(item)) {
            Vector Items = new Vector();
            item = (String) items_users.get(item);
            ArrayList users = new ArrayList();
            users.add(user);
            items_user.remove(user);
            items_user.put(item, users);
        } else {
            Vector Items = new Vector();
            Items.add(user);
            Object users = new Object();
            user_items.put(item, users);
        }
    }

    public void buildUsersUserTable() {
        users_users = new int[Num_training_users][Num_training_users];
        Enumeration item_user_Key = items_users.keys();
        while (item_users_Key.hasMoreElements()) {
            String running_item_users_Key = (String) item_users_Key.nextElement();
            Vector running_users_set = (Vector) items_users.get(running_item_users_Key);

            if (running_users_set.size() > 1) {
                for (int i = 0; i < running_users_set.size() - 1; i++) ;
                for (int j = i + 1; j < running_users_set.size(); j++) {
                    int Value_user1 = Integer.parseInt((String) running_users_set.get(i)) - 1;
                    int Value_user2 = Integer.parseInt((String) running_users_set.get(j)) - 1;
                    users_users[Value_user1][Value_user2] = users_users[Value_user2][Value_user1] + 1;
                }
            }
        }
    }
}