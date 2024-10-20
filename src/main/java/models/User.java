package models;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class User {

    private  int id;
    private String surname;
    private String name;
    private String patronymic;
    private String telephone;
    private Timestamp dateofbirth;

    public User(String surname, String name, String patronymic, String telephone, String dateofbirth)
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        SimpleDateFormat form = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date parse = form.parse(dateofbirth);
            this.dateofbirth = new Timestamp(parse.getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public User(int id, String surname, String name, String patronymic, String telephone, String dateofbirth)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        SimpleDateFormat form = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date parse = form.parse(dateofbirth);
            this.dateofbirth = new Timestamp(parse.getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public User(int id, String surname, String name, String patronymic, String telephone, Timestamp dateofbirth)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.telephone = telephone;
        this.dateofbirth = dateofbirth;
    }

    public int getId() {return this.id; }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public Timestamp getDateofbirth() {
        return this.dateofbirth;
    }

    public void setSurname(String str) {
        this.surname = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPatronymic(String str) {
        this.patronymic = str;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }

    public void setDateofbirth(Timestamp dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return String.format("id: %d\nФамилия: %s\nИмя: %s\nОтчество: %s\nТелефон: %s\nДата рождения: %s\n",
                this.id,
                this.surname,
                this.name,
                this.patronymic,
                this.telephone,
                this.dateofbirth);
    }
}
