package com.qbb.processor;

import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiClass;
import com.qbb.util.PsiAnnotationSearchUtil;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/**
 * Base lombok processor class for class annotations
 *
 * @author Plushnikov Michail
 */
public abstract class AbstractClassProcessor {

  protected AbstractClassProcessor() {
  }


  @NotNull
  public Collection<PsiAnnotation> collectProcessedAnnotations(@NotNull PsiClass psiClass) {
    Collection<PsiAnnotation> result = new ArrayList<>();
    PsiAnnotation psiAnnotation = PsiAnnotationSearchUtil.findAnnotation(psiClass, "");
    if (null != psiAnnotation) {
      result.add(psiAnnotation);
    }
    return result;
  }

}
