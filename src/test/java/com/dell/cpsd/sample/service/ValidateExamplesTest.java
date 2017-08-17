/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.cpsd.sample.service;

import org.junit.Test;

import static com.dell.cpsd.common.json.utils.JsonSchemaValidation.validateSchema;
import static org.junit.Assert.assertNull;

/**
 * This test class validates the JSON message corresponding to the JSD.
 * <p>
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * </p>
 *
 * @version 1.0
 * @since 1.0
 */
public class ValidateExamplesTest
{
    public static final String SCHEMA_DIR   = "/sample-service-api/schema/json/";
    public static final String EXAMPLE_DIR  = "/sample-service-api/schema/example/";
    public static final String INCLUDES_DIR = SCHEMA_DIR + "includes/";
	public static final String STORAGE_DIR = SCHEMA_DIR + "storage/";
	public static final String COMPUTE_DIR = SCHEMA_DIR + "compute/";

    @Test
    public void list_storage_request_message_validation() throws Exception
    {
        String jsdName = "SampleListStorageRequestMessage";
        String jsonName = "SampleListStorageRequestMessage";
        String errors = validateSchema(STORAGE_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", INCLUDES_DIR);
        assertNull(errors, errors);
    }
	
	@Test
    public void configure_node_request_message_validation() throws Exception
    {
        String jsdName = "SampleConfigureNodeRequestMessage";
        String jsonName = "SampleConfigureNodeRequestMessage";
        String errors = validateSchema(COMPUTE_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", INCLUDES_DIR);
        assertNull(errors, errors);
    }

}

