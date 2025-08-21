package com.project.school.user.utility;

import com.project.school.user.dto.User;
import com.project.school.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository repo;

    public DataInitializer(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        if (repo.count() == 0) {
            repo.save(new User("U-1001", "Shipra Aggarwal", "shipra@example.com", "Parent", "Delhi, India"));
            repo.save(new User("U-1002", "Rahul Verma", "rahul@example.com", "Parent", "Mumbai, India"));
            repo.save(new User("U-1003", "Neha Singh", "neha@example.com", "Teacher", "Lucknow, India"));
            repo.save(new User("U-1004", "Vikram Mehta", "vikram@example.com", "Admin", "Pune, India"));
            repo.save(new User("U-1005", "Meera Iyer", "meera@example.com", "Parent", "Chennai, India"));
            repo.save(new User("U-1006", "Arjun Reddy", "arjun@example.com", "Parent", "Hyderabad, India"));
            repo.save(new User("U-1007", "Kabir Khan", "kabir@example.com", "Teacher", "Bangalore, India"));
            repo.save(new User("U-1008", "Ananya Gupta", "ananya@example.com", "Admin", "Kolkata, India"));
            repo.save(new User("U-1009", "Rohan Das", "rohan@example.com", "Parent", "Jaipur, India"));
            repo.save(new User("U-1010", "Priya Mehta", "priya@example.com", "Parent", "Ahmedabad, India"));

            System.out.println("✅ Inserted 10 dummy users into MongoDB");
        } else {
            System.out.println("ℹ️ Users already exist, skipping dummy data load");
        }
    }
}

