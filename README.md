A basic example of the Checker Framework.

`mvn package` fails because a function marked as @NonNull returns null.

## Links

[The Checker Framework](https://checkerframework.org/)

[Will my code become cluttered with type annotations?](https://checkerframework.org/manual/#faq-code-clutter)

> Each annotation that a programmer writes replaces a sentence or phrase of English descriptive text that would otherwise have been written in the Javadoc. So, use of annotations actually reduces the overall size of the documentation, at the same time as making it machine-processable and less ambiguous.

[How to get started annotating legacy code](https://checkerframework.org/manual/#tips-about-writing-annotations)

>  You may find it helpful to start annotating the leaves of the call tree — that is, start with methods/classes/packages that have few dependencies on other code or, equivalently, start with code that a lot of your other code depends on. The reason for this is that it is easiest to annotate a class if the code it calls has already been annotated.

[Type Annotations and Pluggable Type Systems](https://docs.oracle.com/javase/tutorial/java/annotations/type_annotations.html)

[Java 8's new Type Annotations](https://blogs.oracle.com/java-platform-group/java-8s-new-type-annotations)

[Type annotations FAQ](https://checkerframework.org/jsr308/jsr308-faq.html)

[JSR-308 and the Checker Framework Add More Typesafety to jOOQ 3.9](https://www.reddit.com/r/java/comments/4ijw1y/jsr308_and_the_checker_framework_add_more/)

[The Checker Framework enhances Java's type system to make it more powerful and useful.](https://www.reddit.com/r/java/comments/1dk89l/the_checker_framework_enhances_javas_type_system/)

[detect NullPointerExceptions at compile time with Java 8 type annotations](https://www.reddit.com/r/java/comments/4hvp0q/checker_framework_live_demo_detect/)

> The main downside is that it can be slow -- turning on checker-framework changes my javac time from 20 seconds to 8 minutes. Because of the run time I only invoke it occasionally.

[How do I run annotation processing via maven 3.3?](https://stackoverflow.com/questions/32194069/how-do-i-run-annotation-processing-via-maven-3-3)

[The Java Ecosystem’s Obsession with NonNull Annotations](https://blog.jooq.org/2016/11/24/the-java-ecosystems-obsession-with-nonnull-annotations/)

[Java Annotation Processing and Creating a Builder](http://www.baeldung.com/java-annotation-processing-builder)


