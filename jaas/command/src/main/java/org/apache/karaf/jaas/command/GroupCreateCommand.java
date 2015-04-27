/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.karaf.jaas.command;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.jaas.modules.BackingEngine;

@Command(scope = "jaas", name = "group-create", description = "create a group in a realm")
public class GroupCreateCommand extends JaasCommandSupport {
   
    @Argument(index = 0, name = "group", description = "Group", required = true, multiValued = false)
    private String group;

    @Override
    protected Object doExecute(BackingEngine engine) throws Exception {
        engine.createGroup(group);
        return null;
    }

        
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "GroupCreateCommand {group='" + group + "'}";
    }

}