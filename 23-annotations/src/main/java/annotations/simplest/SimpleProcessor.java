package annotations.simplest;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * 1.0v created by wujf on 2021-1-19
 */
@SupportedAnnotationTypes("annotations.simplest.Simple")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SimpleProcessor  extends AbstractProcessor {
  @Override
  public boolean process(Set<? extends TypeElement> annotations,
                         RoundEnvironment roundEnv) {
    for (TypeElement typeElement : annotations) {
      System.out.println(typeElement);
    }
    for (Element el : roundEnv.getElementsAnnotatedWith(Simple.class)) {
      display(el);
    }
    return false;
  }

  private void display(Element el){
    System.out.println("===== " + el + " =====");
    System.out.println(el.getKind() +
            " : " + el.getModifiers() +
            " : " + el.getSimpleName() +
            " : " + el.asType());
    if (el.getKind().equals(ElementKind.CLASS)) {
      TypeElement te = ((TypeElement) el);
      System.out.println(te.getQualifiedName());
      System.out.println(te.getSuperclass());
      System.out.println(te.getEnclosedElements());
    }
    if (el.getKind().equals(ElementKind.METHOD)) {
      ExecutableElement ex = ((ExecutableElement) el);
      System.out.println(ex.getReturnType() + " ");
      System.out.println(ex.getSimpleName() + "(");
      System.out.println(ex.getParameters() + ")");
    }
  }
}
