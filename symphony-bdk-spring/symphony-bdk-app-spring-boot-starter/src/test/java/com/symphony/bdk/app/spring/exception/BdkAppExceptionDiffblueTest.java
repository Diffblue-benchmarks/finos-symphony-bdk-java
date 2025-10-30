package com.symphony.bdk.app.spring.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BdkAppExceptionDiffblueTest {
  /**
   * Test {@link BdkAppException#BdkAppException(BdkAppErrorCode, Exception, String[])}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Params size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAppException#BdkAppException(BdkAppErrorCode, Exception, String[])}
   */
  @Test
  @DisplayName("Test new BdkAppException(BdkAppErrorCode, Exception, String[]); when 'An error occurred'; then return Params size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAppException.<init>(BdkAppErrorCode, Exception, String[])"})
  void testNewBdkAppException_whenAnErrorOccurred_thenReturnParamsSizeIsOne() {
    // Arrange
    Exception e = new Exception("foo");

    // Act
    BdkAppException actualBdkAppException = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, e, "An error occurred");

    // Assert
    List<String> params = actualBdkAppException.getParams();
    assertEquals(1, params.size());
    assertEquals("An error occurred", params.get(0));
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getLocalizedMessage());
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getMessage());
    assertEquals(0, actualBdkAppException.getSuppressed().length);
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualBdkAppException.getErrorCode());
    assertSame(e, actualBdkAppException.getCause());
  }

  /**
   * Test {@link BdkAppException#BdkAppException(BdkAppErrorCode, String[])}.
   * <ul>
   *   <li>When {@code An error occurred}.</li>
   *   <li>Then return Params size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAppException#BdkAppException(BdkAppErrorCode, String[])}
   */
  @Test
  @DisplayName("Test new BdkAppException(BdkAppErrorCode, String[]); when 'An error occurred'; then return Params size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAppException.<init>(BdkAppErrorCode, String[])"})
  void testNewBdkAppException_whenAnErrorOccurred_thenReturnParamsSizeIsOne2() {
    // Arrange and Act
    BdkAppException actualBdkAppException = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred");

    // Assert
    List<String> params = actualBdkAppException.getParams();
    assertEquals(1, params.size());
    assertEquals("An error occurred", params.get(0));
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getLocalizedMessage());
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getMessage());
    assertNull(actualBdkAppException.getCause());
    assertEquals(0, actualBdkAppException.getSuppressed().length);
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualBdkAppException.getErrorCode());
  }

  /**
   * Test {@link BdkAppException#BdkAppException(BdkAppErrorCode, String[])}.
   * <ul>
   *   <li>When {@code AUTH_FAILURE}.</li>
   *   <li>Then return Params Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAppException#BdkAppException(BdkAppErrorCode, String[])}
   */
  @Test
  @DisplayName("Test new BdkAppException(BdkAppErrorCode, String[]); when 'AUTH_FAILURE'; then return Params Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAppException.<init>(BdkAppErrorCode, String[])"})
  void testNewBdkAppException_whenAuthFailure_thenReturnParamsEmpty() {
    // Arrange and Act
    BdkAppException actualBdkAppException = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE);

    // Assert
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getLocalizedMessage());
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getMessage());
    assertNull(actualBdkAppException.getCause());
    assertEquals(0, actualBdkAppException.getSuppressed().length);
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualBdkAppException.getErrorCode());
    assertTrue(actualBdkAppException.getParams().isEmpty());
  }

  /**
   * Test {@link BdkAppException#BdkAppException(BdkAppErrorCode, Exception, String[])}.
   * <ul>
   *   <li>When {@link Exception#Exception(String)} with {@code foo}.</li>
   *   <li>Then return Params Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link BdkAppException#BdkAppException(BdkAppErrorCode, Exception, String[])}
   */
  @Test
  @DisplayName("Test new BdkAppException(BdkAppErrorCode, Exception, String[]); when Exception(String) with 'foo'; then return Params Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BdkAppException.<init>(BdkAppErrorCode, Exception, String[])"})
  void testNewBdkAppException_whenExceptionWithFoo_thenReturnParamsEmpty() {
    // Arrange
    Exception e = new Exception("foo");

    // Act
    BdkAppException actualBdkAppException = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, e);

    // Assert
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getLocalizedMessage());
    assertEquals("Failed to authenticate the extension app with appId={}", actualBdkAppException.getMessage());
    assertEquals(0, actualBdkAppException.getSuppressed().length);
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualBdkAppException.getErrorCode());
    assertTrue(actualBdkAppException.getParams().isEmpty());
    assertSame(e, actualBdkAppException.getCause());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BdkAppException#getErrorCode()}
   *   <li>{@link BdkAppException#getParams()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BdkAppErrorCode BdkAppException.getErrorCode()", "List BdkAppException.getParams()"})
  void testGettersAndSetters() {
    // Arrange
    BdkAppException bdkAppException = new BdkAppException(BdkAppErrorCode.AUTH_FAILURE, "An error occurred");

    // Act
    BdkAppErrorCode actualErrorCode = bdkAppException.getErrorCode();
    List<String> actualParams = bdkAppException.getParams();

    // Assert
    assertEquals(1, actualParams.size());
    assertEquals("An error occurred", actualParams.get(0));
    assertEquals(BdkAppErrorCode.AUTH_FAILURE, actualErrorCode);
  }
}
