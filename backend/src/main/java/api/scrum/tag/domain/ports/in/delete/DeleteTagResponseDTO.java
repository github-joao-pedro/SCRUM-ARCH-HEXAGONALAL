package api.scrum.tag.domain.ports.in.delete;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteTagResponseDTO {
    private UUID id;
    private UUID projectId;
    private String name;
}
