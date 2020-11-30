package com.depromeet.dodo.common.exception;

import java.io.IOException;

public class AwsS3SaveFailedException extends IOException {

	public AwsS3SaveFailedException() {
	}

	public AwsS3SaveFailedException(Throwable t) {
		super(t);
	}

	public AwsS3SaveFailedException(String msg, Throwable t) {
		super(msg, t);
	}

}
