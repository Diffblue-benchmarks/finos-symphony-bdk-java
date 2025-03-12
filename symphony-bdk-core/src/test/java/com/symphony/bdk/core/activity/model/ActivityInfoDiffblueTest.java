package com.symphony.bdk.core.activity.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ActivityInfoDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ActivityInfo}
   *   <li>{@link ActivityInfo#description(String)}
   *   <li>{@link ActivityInfo#name(String)}
   *   <li>{@link ActivityInfo#type(ActivityType)}
   *   <li>{@link ActivityInfo#description()}
   *   <li>{@link ActivityInfo#name()}
   *   <li>{@link ActivityInfo#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ActivityInfo.<init>()", "String ActivityInfo.description()",
      "ActivityInfo ActivityInfo.description(String)", "String ActivityInfo.name()",
      "ActivityInfo ActivityInfo.name(String)", "ActivityType ActivityInfo.type()",
      "ActivityInfo ActivityInfo.type(ActivityType)"})
  void testGettersAndSetters() {
    // Arrange and Act
    ActivityInfo actualActivityInfo = new ActivityInfo();
    ActivityInfo actualDescriptionResult = actualActivityInfo
        .description("The characteristics of someone or something");
    ActivityInfo actualNameResult = actualActivityInfo.name("Name");
    ActivityInfo actualTypeResult = actualActivityInfo.type(ActivityType.COMMAND);
    String actualDescriptionResult2 = actualActivityInfo.description();
    String actualNameResult2 = actualActivityInfo.name();

    // Assert
    assertEquals("Name", actualNameResult2);
    assertEquals("The characteristics of someone or something", actualDescriptionResult2);
    assertEquals(ActivityType.COMMAND, actualActivityInfo.type());
    assertSame(actualActivityInfo, actualDescriptionResult);
    assertSame(actualActivityInfo, actualNameResult);
    assertSame(actualActivityInfo, actualTypeResult);
  }
}
