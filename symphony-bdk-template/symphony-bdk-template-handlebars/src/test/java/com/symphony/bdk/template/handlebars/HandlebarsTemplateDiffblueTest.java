package com.symphony.bdk.template.handlebars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.TagType;
import com.github.jknack.handlebars.internal.Param;
import com.github.jknack.handlebars.internal.VarDecorator;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HandlebarsTemplateDiffblueTest {
  /**
   * Test {@link HandlebarsTemplate#process(Object)}.
   *
   * <ul>
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link HandlebarsTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HandlebarsTemplate.process(Object)"})
  void testProcess_thenReturnEmptyString() {
    // Arrange
    Handlebars handlebars = new Handlebars();
    ArrayList<Param> params = new ArrayList<>();

    VarDecorator template =
        new VarDecorator(handlebars, "Name", TagType.VAR, params, new HashMap<>(), true);

    // Act and Assert
    assertEquals("", new HandlebarsTemplate(template).process("Parameters"));
  }
}
