package com.kobylynskyi.graphql.codegen.model;

public class MappingConfigConstants {

    public static final String DEFAULT_VALIDATION_ANNOTATION = "javax.validation.constraints.NotNull";
    public static final String PARENT_INTERFACE_TYPE_PLACEHOLDER = "{{TYPE}}";
    public static final boolean DEFAULT_GENERATE_APIS = true;
    public static final String DEFAULT_GENERATE_APIS_STRING = "true";
    public static final String DEFAULT_API_NAME_SUFFIX = "Resolver";
    public static final boolean DEFAULT_GENERATE_ASYNC_APIS = false;
    public static final String DEFAULT_GENERATE_ASYNC_APIS_STRING = "false";
    public static final boolean DEFAULT_BUILDER = true;
    public static final String DEFAULT_BUILDER_STRING = "true";
    public static final boolean DEFAULT_EQUALS_AND_HASHCODE = false;
    public static final String DEFAULT_EQUALS_AND_HASHCODE_STRING = "false";
    public static final boolean DEFAULT_GENERATE_IMMUTABLE_MODELS = false;
    public static final String DEFAULT_GENERATE_IMMUTABLE_MODELS_STRING = "false";
    public static final boolean DEFAULT_TO_STRING = false;
    public static final String DEFAULT_TO_STRING_STRING = "false";
    public static final boolean DEFAULT_GENERATE_PARAMETERIZED_FIELDS_RESOLVERS = true;
    public static final String DEFAULT_GENERATE_PARAMETERIZED_FIELDS_RESOLVERS_STRING = "true";
    public static final boolean DEFAULT_GENERATE_EXTENSION_FIELDS_RESOLVERS = false;
    public static final String DEFAULT_GENERATE_EXTENSION_FIELDS_RESOLVERS_STRING = "false";
    public static final boolean DEFAULT_GENERATE_DATA_FETCHING_ENV = false;
    public static final String DEFAULT_GENERATE_DATA_FETCHING_ENV_STRING = "false";
    public static final ApiNamePrefixStrategy DEFAULT_API_NAME_PREFIX_STRATEGY = ApiNamePrefixStrategy.CONSTANT;
    public static final String DEFAULT_API_NAME_PREFIX_STRATEGY_STRING = "CONSTANT";
    public static final ApiRootInterfaceStrategy DEFAULT_API_ROOT_INTERFACE_STRATEGY = ApiRootInterfaceStrategy.SINGLE_INTERFACE;
    public static final String DEFAULT_API_ROOT_INTERFACE_STRATEGY_STRING = "SINGLE_INTERFACE";

    public static final boolean DEFAULT_GENERATE_CLIENT = false;
    public static final String DEFAULT_GENERATE_CLIENT_STRING = "false";
    public static final String DEFAULT_REQUEST_SUFFIX = "Request";
    public static final String DEFAULT_RESPONSE_SUFFIX = "Response";
    public static final String DEFAULT_RESPONSE_PROJECTION_SUFFIX = "ResponseProjection";
    public static final String DEFAULT_PARAMETRIZED_INPUT_SUFIX = "ParametrizedInput";
}
