package org.springframework.cloud.stream.app.websocket.source;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Command line arguments available for {@link WebsocketSourceConfiguration}
 *
 * @author Krishnaprasad A S
 *
 */
@ConfigurationProperties("websocket")
public class WebsocketSourceProperties {

	public static final String DEFAULT_PATH = "/websocket";

	private static final String DEFAULT_ALLOWED_ORIGINS = "*";

	/**
	 * the path on which a WebsocketSource consumer needs to connect. Default is
	 * <tt>/websocket</tt>
	 */
	String path = DEFAULT_PATH;

	/**
	 * the allowed origins. Default is <tt>*</tt>
	 */
	String allowedOrigins = DEFAULT_ALLOWED_ORIGINS;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAllowedOrigins() {
		return allowedOrigins;
	}

	public void setAllowedOrigins(String allowedOrigins) {
		this.allowedOrigins = allowedOrigins;
	}

}
