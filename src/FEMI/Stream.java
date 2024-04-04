package FEMI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream {
    public static int countLetters(List<String> elements){
var result = elements
        .stream()
                .mapToInt(String::length)
                        .sum();



        return result;
    }


    public static List<User> userDetail(List<String> names){
        List<User> users = new ArrayList<>();


        names.stream()
                .forEach((name) -> users.add(new User(name,name.length())));

        return users;
    }




}
