package com.symphony.bdk.test.mockito;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.auth.jwt.UserClaim;
import com.symphony.bdk.core.service.message.model.Message;
import com.symphony.bdk.core.service.message.model.Message.MessageBuilder;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageMatchersDiffblueTest {
  /**
   * Test {@link MessageMatchers#hasContentAndData(Message)}.
   *
   * <p>Method under test: {@link MessageMatchers#hasContentAndData(Message)}
   */
  @Test
  @DisplayName("Test hasContentAndData(Message)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Message MessageMatchers.hasContentAndData(Message)"})
  void testHasContentAndData() {
    // Arrange
    UserClaim userClaim = new UserClaim();
    userClaim.setAvatarSmallUrl("https://example.org/example");
    userClaim.setAvatarUrl("https://example.org/example");
    userClaim.setCompany("Company");
    userClaim.setCompanyId("42");
    userClaim.setDisplayName("Display Name");
    userClaim.setEmailAddress("42 Main St");
    userClaim.setFirstName("Jane");
    userClaim.setId(1L);
    userClaim.setLastName("Doe");
    userClaim.setLocation("Location");
    userClaim.setTitle("Dr");
    userClaim.setUsername("janedoe");
    MessageBuilder builderResult = Message.builder();
    Message message =
        builderResult
            .attachments(new ArrayList<>())
            .content("Not all who wander are lost")
            .data(userClaim)
            .silent(true)
            .version("1.0.2")
            .build();

    // Act and Assert
    assertNull(MessageMatchers.hasContentAndData(message));
  }

  /**
   * Test {@link MessageMatchers#containsContent(String)}.
   *
   * <p>Method under test: {@link MessageMatchers#containsContent(String)}
   */
  @Test
  @DisplayName("Test containsContent(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Message MessageMatchers.containsContent(String)"})
  void testContainsContent() {
    // Arrange, Act and Assert
    assertNull(MessageMatchers.containsContent("Not all who wander are lost"));
  }
}
