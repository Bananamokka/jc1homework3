package com.bananamokka.Util;

import com.bananamokka.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserGenerator {

    public static String[] Names = new String[]{"Amanda", "Michael", "Trevor", "Carl", "Cesar", "Lance","Melvin", "Mike", "Ken","Thomas"};
    public static String[] Surnames = new String[]{"Townly", "de Santa", "Phillips", "Johnson", "Vialpando", "Wilson", "Harris", "Toreno", "Rosenberg", "Vercetti"};
    public static List<User> friends = new ArrayList<>();
    public static List<User> friends1 = new ArrayList<>();
    public static List<User> friends2 = new ArrayList<>();
    public static List<User> friends3 = new ArrayList<>();

    public static List<User> generateUser (int count){
        List<User> Users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            user.setId((long) (Math.random() * 33));
            user.setName(Names[(int) (Math.random() * (Names.length - 1))]);
            user.setSurname(Surnames[(int) (Math.random() * (Surnames.length - 1))]);
            Users.add(user);
        }
        for (int i = 0; i < 6; i++) {
            User user = new User();
            user.setId((long) (Math.random() * 33));
            user.setName(Names[(int) (Math.random() * (Names.length - 1))]);
            user.setSurname(Surnames[(int) (Math.random() * (Surnames.length - 1))]);
            friends.add(user);
        }

        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId((long) (Math.random() * 33));
            user.setName(Names[(int) (Math.random() * (Names.length - 1))]);
            user.setSurname(Surnames[(int) (Math.random() * (Surnames.length - 1))]);
            friends1.add(user);
        }

        for (int i = 0; i < 4; i++) {
            User user = new User();
            user.setId((long) (Math.random() * 33));
            user.setName(Names[(int) (Math.random() * (Names.length - 1))]);
            user.setSurname(Surnames[(int) (Math.random() * (Surnames.length - 1))]);
            friends2.add(user);
        }

        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setId((long) (Math.random() * 33));
            user.setName(Names[(int) (Math.random() * (Names.length - 1))]);
            user.setSurname(Surnames[(int) (Math.random() * (Surnames.length - 1))]);
            friends3.add(user);
        }

        for (User i: friends) {
            i.setFriends(friends1);
        }

        for (User i: friends1) {
            i.setFriends(friends2);
        }

        for (User i: friends2) {
            i.setFriends(friends3);
        }

        for (User i: Users) {
            i.setFriends(friends);
        }

        return Users;
    }
}
