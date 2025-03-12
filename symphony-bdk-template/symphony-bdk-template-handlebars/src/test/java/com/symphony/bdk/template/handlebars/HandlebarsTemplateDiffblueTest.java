package com.symphony.bdk.template.handlebars;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
   * <ul>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link HandlebarsTemplate#process(Object)}
   */
  @Test
  @DisplayName("Test process(Object); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String HandlebarsTemplate.process(Object)"})
  void testProcess_thenReturnEmptyString() {
    // Arrange
    Handlebars handlebars = new Handlebars();
    ArrayList<Param> params = new ArrayList<>();

    // Act and Assert
    assertEquals("",
        (new HandlebarsTemplate(new VarDecorator(handlebars, "Name", TagType.VAR, params, new HashMap<>(), true)))
            .process("Parameters"));
  }
}
