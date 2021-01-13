// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package mobi.hsz.idea.gitignore.file.type.kind

import mobi.hsz.idea.gitignore.file.type.IgnoreFileType
import mobi.hsz.idea.gitignore.lang.kind.FossilLanguage

/**
 * Describes Fossil file type.
 */
class FossilFileType : IgnoreFileType(FossilLanguage.INSTANCE) {

    companion object {
        val INSTANCE = FossilFileType()
    }
}
