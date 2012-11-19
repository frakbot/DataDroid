/**
 * 2011 Foxykeep (http://datadroid.foxykeep.com)
 * <p>
 * Licensed under the Beerware License : <br />
 * As long as you retain this notice you can do whatever you want with this stuff. If we meet some
 * day, and you think this stuff is worth it, you can buy me a beer in return
 */

package com.foxykeep.datadroid.exception;

/**
 * Thrown to indicate that a custom exception occurred.
 * <p>
 * Subclass this class to create special exceptions for your needs.
 *
 * @author Foxykeep
 */
public abstract class CustomException extends Exception {

    private static final long serialVersionUID = 4658308128254827562L;

    private String mRedirectionUrl;
    private int mErrorStatusCode = -1;

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace.
     */
    public CustomException() {
        super();
    }

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage The detail message for this exception.
     * @param throwable The cause of this exception.
     */
    public CustomException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace and the
     * specified detail message.
     *
     * @param detailMessage The detail message for this exception.
     */
    public CustomException(final String detailMessage) {
        super(detailMessage);
    }

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace and the
     * specified detail message.
     *
     * @param detailMessage The detail message for this exception.
     * @param redirection The redirection URL.
     */
    public CustomException(final String detailMessage, final String redirectionUrl) {
        super(detailMessage);
        mRedirectionUrl = redirectionUrl;
    }

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace and the
     * specified detail message and the error status code
     *
     * @param detailMessage The detail message for this exception.
     * @param errorStatusCode The HTTP status code
     */
    public CustomException(final String detailMessage, final int errorStatusCode) {
        super(detailMessage);
        mErrorStatusCode = errorStatusCode;
    }

    /**
     * Constructs a new {@link CustomException} that includes the current stack trace and the
     * specified cause.
     *
     * @param throwable The cause of this exception.
     */
    public CustomException(final Throwable throwable) {
        super(throwable);
    }

    public String getRedirectionUrl() {
        return mRedirectionUrl;
    }

    public int getErrorStatusCode() {
        return mErrorStatusCode;
    }

}