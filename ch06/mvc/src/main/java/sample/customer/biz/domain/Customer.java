package sample.customer.biz.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Customer implements java.io.Serializable {
    private static final long serialVersionUID = 5498108629060769963L;

    private int id;

    @NotNull
    @Size(max = 20)
    private String name;

    @NotNull
    @Pattern(regexp = ".+@.+")
    private String emailAddress;

    @NotNull
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;

    @Max(9)
    @Min(0)
    private Integer favoriteNumber;

    //messages.properties에 저장된 메시지임
    @AssertFalse(message = "{errors.emailAddress.ng}")
    public boolean isNgEmail() {
        if (emailAddress == null) {
            return false;
        }
        //도메인 'ng.foo.baz'이면 사용자 불가 어드레스로 처리
        return emailAddress.matches(".*@ng.foo.baz$");
    }

    public Customer() {
    }

    public Customer(String name, String emailAddress,
                    Date birthday, Integer favoriteNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.favoriteNumber = favoriteNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setFavoriteNumber(Integer favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer [id=%s, name=%s, emailAddress=%s, birthday=%s, favoriteNumber=%s]",
                id, name, emailAddress, birthday, favoriteNumber);
    }
}
