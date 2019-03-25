/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A job template is a pre-made set of encoding instructions that you can use to quickly create a job. */
    private JobTemplate jobTemplate;

    /**
     * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     * 
     * @param jobTemplate
     *        A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     */

    public void setJobTemplate(JobTemplate jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     * 
     * @return A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     */

    public JobTemplate getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     * 
     * @param jobTemplate
     *        A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateResult withJobTemplate(JobTemplate jobTemplate) {
        setJobTemplate(jobTemplate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: ").append(getJobTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobTemplateResult == false)
            return false;
        CreateJobTemplateResult other = (CreateJobTemplateResult) obj;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobTemplateResult clone() {
        try {
            return (CreateJobTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
