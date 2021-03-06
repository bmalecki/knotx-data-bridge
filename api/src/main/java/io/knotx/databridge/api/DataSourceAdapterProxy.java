/*
 * Copyright (C) 2018 Knot.x Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.knotx.databridge.api;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;

@ProxyGen
@VertxGen
public interface DataSourceAdapterProxy {

  static DataSourceAdapterProxy createProxy(Vertx vertx, String address) {
    return new DataSourceAdapterProxyVertxEBProxy(vertx, address);
  }

  static DataSourceAdapterProxy createProxyWithOptions(Vertx vertx, String address, DeliveryOptions deliveryOptions) {
    return new DataSourceAdapterProxyVertxEBProxy(vertx, address, deliveryOptions);
  }

  void process(DataSourceAdapterRequest request, Handler<AsyncResult<DataSourceAdapterResponse>> result);
}
