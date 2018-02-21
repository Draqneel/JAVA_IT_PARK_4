package project.app;

import com.google.common.collect.Lists;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project.models.User;
import project.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ru.itpark\\context.xml");
        UsersRepository usersRepository = context.getBean(UsersRepository.class);
        System.out.println(usersRepository.findAll());

        System.out.println(usersRepository.findOneByCitizen("Россия"));
    }
}
