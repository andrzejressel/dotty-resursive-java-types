```
[IJ]++2.13.10 compile
[info] Setting Scala version to 2.13.10 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala33-compiler-crash (in build file:/D:/MojeProgramy/scala33-crash/)
[success] Total time: 0 s, completed 4 cze 2023, 17:23:59
[IJ]++3.3.0 compile
[info] Setting Scala version to 3.3.0 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala33-compiler-crash (in build file:/D:/MojeProgramy/scala33-crash/)
[info] compiling 1 Scala source and 2 Java sources to D:\MojeProgramy\scala33-crash\target\scala-3.3.0\classes ...
[error] -- [E057] Type Mismatch Error: D:\MojeProgramy\scala33-crash\src\main\java\test\ToCopyableBuilder.java:1:45
[error] 1 |public interface ToCopyableBuilder<B extends CopyableBuilder<B, T>, T extends ToCopyableBuilder<B, T>> {
[error]   |                                             ^
[error]   |Type argument T does not conform to upper bound ToCopyableBuilder[B, T] in subpart CopyableBuilder[B, T] of inferred type  <: CopyableBuilder[B, T]
[error]   |
[error]   | longer explanation available when compiling with `-explain`
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 0 s, completed 4 cze 2023, 17:24:01
[IJ]
```