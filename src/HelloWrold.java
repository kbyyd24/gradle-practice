import com.google.common.collect.ImmutableMap;

public class HelloWrold {

  public static void main(String[] args) {
    ImmutableMap.of("Hello", "World")
        .forEach((key, value) -> System.out.println(key + " " + value));
  }
}