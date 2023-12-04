package lk.ijse.dep11.edupanel.to.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerResTO implements Serializable {
    private Integer id;
    private String name;
    private String designation;
    private String qualifications;
    private String type;
    private String pictureUrl;
    private String linkedin;


}
