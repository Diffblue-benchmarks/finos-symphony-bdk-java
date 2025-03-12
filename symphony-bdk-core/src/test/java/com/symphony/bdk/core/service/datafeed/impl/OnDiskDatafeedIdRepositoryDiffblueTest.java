package com.symphony.bdk.core.service.datafeed.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.config.model.BdkDatafeedConfig;
import com.symphony.bdk.core.config.model.BdkRetryConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class OnDiskDatafeedIdRepositoryDiffblueTest {
  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenThrow(new IOException("Writing datafeed id {} to file: {}"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId2() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setIdFilePath("Writing datafeed id {} to file: {}");
      datafeed.setRetry(new BdkRetryConfig());
      datafeed.setVersion("1.0.2");

      BdkConfig config = new BdkConfig();
      config.setDatafeed(datafeed);

      // Act
      (new OnDiskDatafeedIdRepository(config)).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setIdFilePath("/directory/foo.txt");
      datafeed.setRetry(new BdkRetryConfig());
      datafeed.setVersion("1.0.2");

      BdkConfig config = new BdkConfig();
      config.setDatafeed(datafeed);

      // Act
      (new OnDiskDatafeedIdRepository(config)).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath2() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenThrow(new IOException("Writing datafeed id {} to file: {}"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath3() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setIdFilePath("Writing datafeed id {} to file: {}");
      datafeed.setRetry(new BdkRetryConfig());
      datafeed.setVersion("1.0.2");

      BdkConfig config = new BdkConfig();
      config.setDatafeed(datafeed);

      // Act
      (new OnDiskDatafeedIdRepository(config)).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#exists(Path, LinkOption[])} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files exists(Path, LinkOption[]) return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesExistsReturnTrue() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#isSymbolicLink(Path)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files isSymbolicLink(Path) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesIsSymbolicLinkReturnFalse() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(false);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#readSymbolicLink(Path)} return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'; given Files readSymbolicLink(Path) return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_givenFilesReadSymbolicLinkReturnNull() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any())).thenReturn(null);
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      System.getProperty("java.io.tmpdir");

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String, String)} with {@code datafeedId}, {@code agentBasePath}.
   * <ul>
   *   <li>Then calls {@link Files#createDirectories(Path, FileAttribute[])}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String, String)}
   */
  @Test
  @DisplayName("Test write(String, String) with 'datafeedId', 'agentBasePath'; then calls createDirectories(Path, FileAttribute[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String, String)"})
  void testWriteWithDatafeedIdAgentBasePath_thenCallsCreateDirectories() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42", "Agent Base Path");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code /directory/foo.txt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'; given BdkDatafeedConfig (default constructor) IdFilePath is '/directory/foo.txt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenBdkDatafeedConfigIdFilePathIsDirectoryFooTxt() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
      datafeed.setIdFilePath("/directory/foo.txt");
      datafeed.setRetry(new BdkRetryConfig());
      datafeed.setVersion("1.0.2");

      BdkConfig config = new BdkConfig();
      config.setDatafeed(datafeed);

      // Act
      (new OnDiskDatafeedIdRepository(config)).write("42");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#exists(Path, LinkOption[])} return {@code true}.</li>
   *   <li>Then calls {@link Files#newOutputStream(Path, OpenOption[])}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'; given Files exists(Path, LinkOption[]) return 'true'; then calls newOutputStream(Path, OpenOption[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesExistsReturnTrue_thenCallsNewOutputStream() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(true);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#isSymbolicLink(Path)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'; given Files isSymbolicLink(Path) return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesIsSymbolicLinkReturnFalse() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(false);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <ul>
   *   <li>Given {@link Files} {@link Files#readSymbolicLink(Path)} return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'; given Files readSymbolicLink(Path) return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_givenFilesReadSymbolicLinkReturnNull() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any())).thenReturn(null);
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      System.getProperty("java.io.tmpdir");

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42");

      // Assert
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#write(String)} with {@code datafeedId}.
   * <ul>
   *   <li>Then calls {@link Files#createDirectories(Path, FileAttribute[])}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#write(String)}
   */
  @Test
  @DisplayName("Test write(String) with 'datafeedId'; then calls createDirectories(Path, FileAttribute[])")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OnDiskDatafeedIdRepository.write(String)"})
  void testWriteWithDatafeedId_thenCallsCreateDirectories() throws IOException {
    try (MockedStatic<Files> mockFiles = mockStatic(Files.class)) {

      // Arrange
      mockFiles.when(() -> Files.readSymbolicLink(Mockito.<Path>any()))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
      mockFiles.when(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class))).thenReturn(false);
      mockFiles.when(() -> Files.isSymbolicLink(Mockito.<Path>any())).thenReturn(true);
      mockFiles.when(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)))
          .thenReturn(new ByteArrayOutputStream(1));
      mockFiles.when(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)))
          .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

      // Act
      (new OnDiskDatafeedIdRepository(new BdkConfig())).write("42");

      // Assert
      mockFiles.verify(() -> Files.createDirectories(Mockito.<Path>any(), isA(FileAttribute[].class)));
      mockFiles.verify(() -> Files.exists(Mockito.<Path>any(), isA(LinkOption[].class)), atLeast(1));
      mockFiles.verify(() -> Files.isSymbolicLink(Mockito.<Path>any()));
      mockFiles.verify(() -> Files.newOutputStream(Mockito.<Path>any(), isA(OpenOption[].class)));
      mockFiles.verify(() -> Files.readSymbolicLink(Mockito.<Path>any()));
    }
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#read()}.
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code /directory/foo.txt}.</li>
   *   <li>Then return not Present.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#read()}
   */
  @Test
  @DisplayName("Test read(); given BdkDatafeedConfig (default constructor) IdFilePath is '/directory/foo.txt'; then return not Present")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Optional OnDiskDatafeedIdRepository.read()"})
  void testRead_givenBdkDatafeedConfigIdFilePathIsDirectoryFooTxt_thenReturnNotPresent() {
    // Arrange
    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkConfig config = new BdkConfig();
    config.setDatafeed(datafeed);

    // Act and Assert
    assertFalse((new OnDiskDatafeedIdRepository(config)).read().isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#read()}.
   * <ul>
   *   <li>Then return not Present.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#read()}
   */
  @Test
  @DisplayName("Test read(); then return not Present")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Optional OnDiskDatafeedIdRepository.read()"})
  void testRead_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse((new OnDiskDatafeedIdRepository(new BdkConfig())).read().isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#readAgentBasePath()}.
   * <ul>
   *   <li>Given {@link BdkDatafeedConfig} (default constructor) IdFilePath is {@code /directory/foo.txt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#readAgentBasePath()}
   */
  @Test
  @DisplayName("Test readAgentBasePath(); given BdkDatafeedConfig (default constructor) IdFilePath is '/directory/foo.txt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Optional OnDiskDatafeedIdRepository.readAgentBasePath()"})
  void testReadAgentBasePath_givenBdkDatafeedConfigIdFilePathIsDirectoryFooTxt() {
    // Arrange
    BdkDatafeedConfig datafeed = new BdkDatafeedConfig();
    datafeed.setIdFilePath("/directory/foo.txt");
    datafeed.setRetry(new BdkRetryConfig());
    datafeed.setVersion("1.0.2");

    BdkConfig config = new BdkConfig();
    config.setDatafeed(datafeed);

    // Act and Assert
    assertFalse((new OnDiskDatafeedIdRepository(config)).readAgentBasePath().isPresent());
  }

  /**
   * Test {@link OnDiskDatafeedIdRepository#readAgentBasePath()}.
   * <ul>
   *   <li>Then return not Present.</li>
   * </ul>
   * <p>
   * Method under test: {@link OnDiskDatafeedIdRepository#readAgentBasePath()}
   */
  @Test
  @DisplayName("Test readAgentBasePath(); then return not Present")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Optional OnDiskDatafeedIdRepository.readAgentBasePath()"})
  void testReadAgentBasePath_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse((new OnDiskDatafeedIdRepository(new BdkConfig())).readAgentBasePath().isPresent());
  }
}
