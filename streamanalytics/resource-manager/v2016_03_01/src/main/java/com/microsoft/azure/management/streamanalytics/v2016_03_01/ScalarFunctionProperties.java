/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The properties that are associated with a scalar function.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Scalar")
@JsonFlatten
public class ScalarFunctionProperties extends FunctionProperties {
    /**
     * A list of inputs describing the parameters of the function.
     */
    @JsonProperty(value = "properties.inputs")
    private List<FunctionInput> inputs;

    /**
     * The output of the function.
     */
    @JsonProperty(value = "properties.output")
    private FunctionOutput output;

    /**
     * The physical binding of the function. For example, in the Azure Machine
     * Learning web service’s case, this describes the endpoint.
     */
    @JsonProperty(value = "properties.binding")
    private FunctionBinding binding;

    /**
     * Get a list of inputs describing the parameters of the function.
     *
     * @return the inputs value
     */
    public List<FunctionInput> inputs() {
        return this.inputs;
    }

    /**
     * Set a list of inputs describing the parameters of the function.
     *
     * @param inputs the inputs value to set
     * @return the ScalarFunctionProperties object itself.
     */
    public ScalarFunctionProperties withInputs(List<FunctionInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the output of the function.
     *
     * @return the output value
     */
    public FunctionOutput output() {
        return this.output;
    }

    /**
     * Set the output of the function.
     *
     * @param output the output value to set
     * @return the ScalarFunctionProperties object itself.
     */
    public ScalarFunctionProperties withOutput(FunctionOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get the physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     *
     * @return the binding value
     */
    public FunctionBinding binding() {
        return this.binding;
    }

    /**
     * Set the physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     *
     * @param binding the binding value to set
     * @return the ScalarFunctionProperties object itself.
     */
    public ScalarFunctionProperties withBinding(FunctionBinding binding) {
        this.binding = binding;
        return this;
    }

}
