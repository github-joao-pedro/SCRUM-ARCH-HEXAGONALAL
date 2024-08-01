package api.scrum.tag.domain.ports.in.create;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTagRequestDTO {
    private UUID projectId;
    private String name;
}
