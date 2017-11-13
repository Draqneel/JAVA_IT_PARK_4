
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class HumanDataStorage {

    JdbcTemplate template;

    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(age, name, citizen) VALUES (?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL =
            "SELECT * FROM owner";
    //language=SQL
    private static final String SQL_FIND_BY_ID =
            "SELECT * FROM owner WHERE id = ?";


    public static void main(String[] args) {
    }

    public HumanDataStorage(String URL, String USER, String PASSWORD) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);
        template = new JdbcTemplate(dataSource);

    }

    public void addNewHuman(int age, String name, String citizen) {
        Human human = new Human(age, name, citizen);
        template.update(SQL_INSERT_USER, human.getAge(), human.getName(), human.getCitizen());
        System.out.println("COMPLETE");
    }

    public Human getHumanByID(Long id) {
        return template.queryForObject(SQL_FIND_BY_ID, new HumanRowMapper(), id);
    }

    public List<Human> getHumanList(){
        return template.query(SQL_SELECT_ALL,new HumanRowMapper());
    }


}
