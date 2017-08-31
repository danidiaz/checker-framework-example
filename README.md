A basic example of the Checker Framework.

`mvn package` fails because a function marked as @NonNull returns null.

## Links

[The Checker Framework](https://checkerframework.org/)

[Type Annotations and Pluggable Type Systems](https://docs.oracle.com/javase/tutorial/java/annotations/type_annotations.html)

[Java 8's new Type Annotations](https://blogs.oracle.com/java-platform-group/java-8s-new-type-annotations)

[JSR-308 and the Checker Framework Add More Typesafety to jOOQ 3.9](https://www.reddit.com/r/java/comments/4ijw1y/jsr308_and_the_checker_framework_add_more/)

[The Checker Framework enhances Java's type system to make it more powerful and useful.](https://www.reddit.com/r/java/comments/1dk89l/the_checker_framework_enhances_javas_type_system/)

[detect NullPointerExceptions at compile time with Java 8 type annotations](https://www.reddit.com/r/java/comments/4hvp0q/checker_framework_live_demo_detect/)

> The main downside is that it can be slow -- turning on checker-framework changes my javac time from 20 seconds to 8 minutes. Because of the run time I only invoke it occasionally.
