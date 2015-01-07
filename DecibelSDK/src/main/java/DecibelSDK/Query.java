package DecibelSDK;

/**
 * The base type for all queries
 * 
 * @param <TResult> The type of result object returned by the query
 */
public interface Query<TResult> {
    String getQueryString();
}
