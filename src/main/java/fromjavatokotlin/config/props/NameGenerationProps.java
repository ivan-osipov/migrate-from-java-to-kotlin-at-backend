package fromjavatokotlin.config.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("app")
public class NameGenerationProps {
  private String robotNameTemplate;
}