package com.symphony.bdk.http.webclient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.Pair;
import com.symphony.bdk.http.api.auth.Authentication;
import com.symphony.bdk.http.api.util.TypeReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

class ApiClientWebClientDiffblueTest {
  /**
   * Test {@link ApiClientWebClient#ApiClientWebClient(WebClient, String, Map)}.
   * <p>
   * Method under test: {@link ApiClientWebClient#ApiClientWebClient(WebClient, String, Map)}
   */
  @Test
  @DisplayName("Test new ApiClientWebClient(WebClient, String, Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientWebClient.<init>(WebClient, String, Map)"})
  void testNewApiClientWebClient() {
    // Arrange
    WebClient webClient = mock(WebClient.class);

    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    ApiClientWebClient actualApiClientWebClient = new ApiClientWebClient(webClient, "https://example.org/example",
        defaultHeaders);

    // Assert
    assertEquals("https://example.org/example", actualApiClientWebClient.getBasePath());
    assertTrue(actualApiClientWebClient.enforcedAuthenticationSchemes.isEmpty());
    assertTrue(actualApiClientWebClient.getAuthentications().isEmpty());
    assertEquals(defaultHeaders, actualApiClientWebClient.defaultHeaderMap);
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Given pair {@code https://example.org/example} and {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given pair 'https://example.org/example' and 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_givenPairHttpsExampleOrgExampleAndHttpsExampleOrgExample() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> apiClientWebClient.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>Given pair {@code https://example.org/example} and {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); given pair 'https://example.org/example' and 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_givenPairHttpsExampleOrgExampleAndHttpsExampleOrgExample2() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    queryParams.add(Pair.pair("https://example.org/example", "https://example.org/example"));
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> apiClientWebClient.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when ArrayList(); then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenArrayList_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> apiClientWebClient.<Object>invokeAPI("https://example.org/example", "https://example.org/example",
            queryParams, "Body", headerParams, cookieParams, new HashMap<>(), "https://example.org/example",
            "https://example.org/example", new String[]{"https://example.org/example"}, mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When {@code GET}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when 'GET'; then throw RuntimeException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenGet_thenThrowRuntimeException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(RuntimeException.class,
        () -> apiClientWebClient.<Object>invokeAPI("https://example.org/example", "GET", queryParams, "Body",
            headerParams, cookieParams, new HashMap<>(), "https://example.org/example", "https://example.org/example",
            new String[]{"https://example.org/example"}, mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)}
   */
  @Test
  @DisplayName("Test invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference); when 'null'; then throw ApiException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({
      "com.symphony.bdk.http.api.ApiResponse ApiClientWebClient.invokeAPI(String, String, List, Object, Map, Map, Map, String, String, String[], TypeReference)"})
  void testInvokeAPI_whenNull_thenThrowApiException() throws ApiException {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();
    HashMap<String, String> cookieParams = new HashMap<>();

    // Act and Assert
    assertThrows(ApiException.class,
        () -> apiClientWebClient.<Object>invokeAPI("https://example.org/example", null, queryParams, "Body",
            headerParams, cookieParams, new HashMap<>(), "https://example.org/example", "https://example.org/example",
            new String[]{"https://example.org/example"}, mock(TypeReference.class)));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", apiClientWebClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42,42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); given '42'; when ArrayList() add '42'; then return '42,42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_given42_whenArrayListAdd42_thenReturn4242() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42,42", apiClientWebClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when ArrayList(); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenArrayList_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    // Act and Assert
    assertEquals("", apiClientWebClient.parameterToString(new ArrayList<>()));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'null'; then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("", (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .parameterToString(null));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code Param}.</li>
   *   <li>Then return {@code Param}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToString(Object)}
   */
  @Test
  @DisplayName("Test parameterToString(Object); when 'Param'; then return 'Param'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.parameterToString(Object)"})
  void testParameterToString_whenParam_thenReturnParam() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("Param", (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .parameterToString("Param"));
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given ArrayList(); when LinkedHashSet() add ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenArrayList_whenLinkedHashSetAddArrayList() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult = apiClientWebClient.parameterToPairs(null, "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When empty string.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when empty string; then return first Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientWebClient.parameterToPairs("", "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientWebClient.parameterToPairs(null, "https://example.org/example",
        objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when LinkedHashSet() add 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenLinkedHashSetAddNull2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientWebClient.parameterToPairs("https://example.org/example",
        "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@code multi}.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); given 'null'; when 'multi'; then return first Value is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = apiClientWebClient.parameterToPairs("multi",
        "https://example.org/example", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenArrayList_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    // Act and Assert
    assertTrue(apiClientWebClient
        .parameterToPairs("https://example.org/example", "https://example.org/example", new ArrayList<>())
        .isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when empty string; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .parameterToPairs(null, "", null)
        .isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .parameterToPairs(null, null, null)
        .isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .parameterToPairs(null, "https://example.org/example", null)
        .isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code Value}.</li>
   *   <li>Then return first Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @DisplayName("Test parameterToPairs(String, String, Object); when 'Value'; then return first Value is 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List ApiClientWebClient.parameterToPairs(String, String, Object)"})
  void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act
    List<Pair> actualParameterToPairsResult = (new ApiClientWebClient(mock(WebClient.class),
        "https://example.org/example", defaultHeaders))
        .parameterToPairs("https://example.org/example", "https://example.org/example", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Value", getResult.getValue());
    assertEquals("https://example.org/example", getResult.getName());
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;U}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'application/json ;U'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json ;U",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .selectHeaderAccept(new String[]{"application/json ;U"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code * /*}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return '*/*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("*/*", (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .selectHeaderAccept(new String[]{"*/*"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code https://example.org/example}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); then return 'https://example.org/example'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_thenReturnHttpsExampleOrgExample() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("https://example.org/example",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .selectHeaderAccept(new String[]{"https://example.org/example"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when array of String with 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("null", (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .selectHeaderAccept(new String[]{null}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderAccept(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderAccept(String[]); when empty array of String; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderAccept(String[])"})
  void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertNull((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .selectHeaderAccept(new String[]{}));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;U}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'application/json ;U'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenApplicationJsonU_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .isJsonMime("application/json ;U"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code * /*}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when '*/*'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenAsteriskSlashAsterisk_thenReturnTrue() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertTrue((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .isJsonMime("*/*"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code https://example.org/example}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'https://example.org/example'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenHttpsExampleOrgExample_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertFalse((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .isJsonMime("https://example.org/example"));
  }

  /**
   * Test {@link ApiClientWebClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#isJsonMime(String)}
   */
  @Test
  @DisplayName("Test isJsonMime(String); when 'null'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApiClientWebClient.isJsonMime(String)"})
  void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertFalse((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .isJsonMime(null));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;U}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return 'application/json ;U'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnApplicationJsonU() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json ;U",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .selectHeaderContentType(new String[]{"application/json ;U"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code * /*}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); then return '*/*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_thenReturnAsteriskSlashAsterisk() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("*/*", (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .selectHeaderContentType(new String[]{"*/*"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when array of String with 'null'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertNull((new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
        .selectHeaderContentType(new String[]{null}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.</li>
   *   <li>Then return {@code text/plain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when array of String with 'text/plain'; then return 'text/plain'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("text/plain",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .selectHeaderContentType(new String[]{"text/plain"}));
  }

  /**
   * Test {@link ApiClientWebClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code application/json}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClientWebClient#selectHeaderContentType(String[])}
   */
  @Test
  @DisplayName("Test selectHeaderContentType(String[]); when empty array of String; then return 'application/json'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.selectHeaderContentType(String[])"})
  void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("application/json",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .selectHeaderContentType(new String[]{}));
  }

  /**
   * Test {@link ApiClientWebClient#escapeString(String)}.
   * <p>
   * Method under test: {@link ApiClientWebClient#escapeString(String)}
   */
  @Test
  @DisplayName("Test escapeString(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String ApiClientWebClient.escapeString(String)"})
  void testEscapeString() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");

    // Act and Assert
    assertEquals("https://example.org/example",
        (new ApiClientWebClient(mock(WebClient.class), "https://example.org/example", defaultHeaders))
            .escapeString("https://example.org/example"));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiClientWebClient#getAuthentications()}
   *   <li>{@link ApiClientWebClient#getBasePath()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map ApiClientWebClient.getAuthentications()", "String ApiClientWebClient.getBasePath()"})
  void testGettersAndSetters() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    // Act
    Map<String, Authentication> actualAuthentications = apiClientWebClient.getAuthentications();

    // Assert
    assertEquals("https://example.org/example", apiClientWebClient.getBasePath());
    assertTrue(actualAuthentications.isEmpty());
  }

  /**
   * Test {@link ApiClientWebClient#addEnforcedAuthenticationScheme(String)}.
   * <p>
   * Method under test: {@link ApiClientWebClient#addEnforcedAuthenticationScheme(String)}
   */
  @Test
  @DisplayName("Test addEnforcedAuthenticationScheme(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApiClientWebClient.addEnforcedAuthenticationScheme(String)"})
  void testAddEnforcedAuthenticationScheme() {
    // Arrange
    HashMap<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Delivered-To", "alice.liddell@example.org");
    ApiClientWebClient apiClientWebClient = new ApiClientWebClient(mock(WebClient.class), "https://example.org/example",
        defaultHeaders);

    // Act
    apiClientWebClient.addEnforcedAuthenticationScheme("https://example.org/example");

    // Assert
    List<String> stringList = apiClientWebClient.enforcedAuthenticationSchemes;
    assertEquals(1, stringList.size());
    assertEquals("https://example.org/example", stringList.get(0));
  }
}
