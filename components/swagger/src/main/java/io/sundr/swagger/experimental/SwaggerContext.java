/*
 *      Copyright 2018 The original authors.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package io.sundr.swagger.experimental;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.CodegenConfig;
import io.swagger.models.Swagger;

public class SwaggerContext {

  private final Swagger swagger;
  private final CodegenConfig config;
  private final ClientOptInput opts;
  private final SwaggerRepository repository = new SwaggerRepository();

  public SwaggerContext(Swagger swagger, CodegenConfig config, ClientOptInput opts) {
    this.swagger = swagger;
    this.config = config;
    this.opts = opts;
  }

  public Swagger getSwagger() {
    return swagger;
  }

  public CodegenConfig getConfig() {
    return config;
  }

  public ClientOptInput getOpts() {
    return opts;
  }

  public SwaggerRepository getRepository() {
    return repository;
  }
}
