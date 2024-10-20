package models;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data

public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  int id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "dateofbirth")
    private Timestamp dateofbirth;
}
