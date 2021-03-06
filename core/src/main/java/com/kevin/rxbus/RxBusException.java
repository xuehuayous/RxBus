/*
 * Copyright 2017 Kevin zhou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevin.rxbus;

/**
 * An {@link RuntimeException} thrown in cases something went wrong inside RxBus.
 *
 * @author zwenkai on 2017-05-06 15:51:47
 *
 */

public class RxBusException extends RuntimeException {

    public RxBusException(String detailMessage) {
        super(detailMessage);
    }

    public RxBusException(Throwable throwable) {
        super(throwable);
    }

    public RxBusException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

}
