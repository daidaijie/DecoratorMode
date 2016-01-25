package com.net.second;

import com.net.second.decorator.BigTrouser;
import com.net.second.decorator.People;
import com.net.second.decorator.TShirts;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Main {
    public static void main(String[] args) {
        People people = new People("呆杰");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.Decorate(people);
        tShirts.Decorate(bigTrouser);

        tShirts.show();
    }
}
