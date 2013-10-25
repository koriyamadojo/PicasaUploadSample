/*
 * Copyright (c) 2013 Kenichi Takahashi
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
 
 package org.ktaka.picasasample;

import java.io.IOException;

import android.net.Uri;

public class AsyncUploader extends CommonAsyncTask {

	Uri uri;
	AsyncUploader(PicasaUploadActivity activity, Uri uri) {
		super(activity);
		this.uri = uri;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doInBackground() throws IOException {
		activity.uploadPhoto(uri);
	}

	static void run(PicasaUploadActivity tasksSample, Uri uri) {
		new AsyncUploader(tasksSample, uri).execute();
	}
}
