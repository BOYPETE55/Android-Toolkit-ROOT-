/*
 * Copyright (C) 2016 Angad Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.angads25.filepicker.model

import java.io.File

/**
 *
 *
 * Created by Angad Singh on 11-07-2016.
 *
 */

/*  Descriptor class to define properties of the Dialog. Actions are performed upon
 *  these Properties
 */
class DialogProperties {
    /** Selection Mode defines whether a single of multiple Files/Directories
     * have to be selected.
     *
     * SINGLE_MODE and MULTI_MODE are the two selection modes, See DialogConfigs
     * for more info. Set to SINGLE_MODE as default value by constructor.
     */
    var selection_mode: Int = 0

    /** Selection Type defines that whether a File/Directory or both of these has
     * to be selected.
     *
     * FILE_SELECT ,DIR_SELECT, FILE_AND_DIR_SELECT are the three selection modes,
     * See DialogConfigs for more info. Set to FILE_SELECT as default value by constructor.
     */
    var selection_type: Int = 0

    /**  The Parent/Root Directory. List of Files are populated from here. Can be set
     * to any readable directory. /sdcard is the default location.
     *
     * Eg. /sdcard
     * Eg. /mnt
     */
    var root: File

    /**  The Directory is used when Root Directory is not readable or accessible. /
     * sdcard is the default location.
     *
     * Eg. /sdcard
     * Eg. /mnt
     */
    var error_dir: File

    /** The Directory can be used as an offset. It is the first directory that is
     * shown in dialog. Consider making it Root's sub-directory.
     *
     * Eg. Root: /sdcard
     * Eg. Offset: /sdcard/Music/Country
     *
     */
    var offset: File

    /** An Array of String containing extensions, Files with only that will be shown.
     * Others will be ignored. Set to null as default value by constructor.
     * Eg. String ext={"jpg","jpeg","png","gif"};
     */
    var extensions: Array<String>? = null

    var hasStorageButton: Boolean = false

    init {
        selection_mode = DialogConfigs.SINGLE_MODE
        selection_type = DialogConfigs.FILE_SELECT
        root = File(DialogConfigs.DEFAULT_DIR)
        error_dir = File(DialogConfigs.DEFAULT_DIR)
        offset = File(DialogConfigs.DEFAULT_DIR)
        extensions = null
        hasStorageButton = false
    }
}
