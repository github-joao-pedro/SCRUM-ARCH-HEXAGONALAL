package api.scrum.user.domain.ports.in.update;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestDTO {
    private UUID id;
    private String nickname;
    private String email;
    private String password;
    private String name;
    private String profilePicture;
}
