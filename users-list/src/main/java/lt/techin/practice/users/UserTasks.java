package lt.techin.practice.users;

import java.util.*;

public class UserTasks {

    // Count how many users in the list are older than 25.
    public static Integer countUsersOlderThan25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) count++;
        }
        return count;
    }

    // Calculate and return the average age of all users in the list.
    public static double getAverageAge(List<User> users) {
       return (double) sumAge(users) / users.size();
    }

    // Find and return the smallest age from the list of users.
    public static Integer getMinAge(List<User> users) {
        int smallest = users.get(0).getAge();

        for (User user : users) {
            if (user.getAge() < smallest) {
                smallest = user.getAge();
            }
        }
        return smallest;

    }

    // Find the first user whose name matches the provided name.
    public static User findByName(List<User> users, String name) {
        for(User user: users) {
            if(user.getName().contains(name)) return user;
        }

        return null;
    }

    // Return a new list of users sorted by age in ascending order.
    public static List<User> sortByAge(List<User> users) {
        List<User> sortedList = new ArrayList<>(users);

        

        return sortedList;
    }

    // Find and return the oldest user in the list.
    public static User findOldest(List<User> users) {
        User oldest = users.get(0);

        for (User user : users) {
            if (user.getAge() > oldest.getAge()) {
                oldest = user;
            }
        }
        return oldest;
    }

    // Sum all user ages and return the result as an int.
    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }

    // Count how many users have the provided hobby in their hobbies collection.
    public static Integer countUsersWithTheHobby(List<User> users, String hobby) {
        int hobbiesCount = 0;
        for (User user : users) {
            if(!user.getHobbies().isEmpty()) {
                if(user.getHobbies().contains(hobby)) {
                    hobbiesCount++;
                }
            }
        }
        return hobbiesCount;

    }

    // Find and return all users who have the provided hobby.
    public static List<User> findUsersWithHobby(List<User> users, String hobby) {
        List<User> usersWithHobbies = new ArrayList<>();
        for (User user : users) {
            if(user.getHobbies().contains(hobby)) {
                usersWithHobbies.add(user);
            }
        }

        return usersWithHobbies;

    }

    // Return all unique hobbies from every user as a set.
    public static Set<String> getUniqueHobbies(List<User> users) {
        Set<String> allUniqueHobbies = new HashSet<>();

        for(User user: users) {
            allUniqueHobbies.addAll(user.getHobbies());
        }

        return allUniqueHobbies;
    }

}
