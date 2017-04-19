import java.lang.annotation.*;
import java.lang.reflect.Method;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {
  String aspectratio() default  "4:3";
  String classification() default "TFT";
}

@Monitor
public class Screen {
  private int width;
  private int height;
}
