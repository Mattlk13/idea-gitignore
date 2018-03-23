/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.gitignore.lang.kind;

import mobi.hsz.idea.gitignore.file.type.IgnoreFileType;
import mobi.hsz.idea.gitignore.file.type.kind.HelmFileType;
import mobi.hsz.idea.gitignore.lang.IgnoreLanguage;
import mobi.hsz.idea.gitignore.util.Icons;
import org.jetbrains.annotations.NotNull;

/**
 * Kubernetes Helm {@link IgnoreLanguage} definition.
 *
 * @author Sergei Ivanov
 * @since 2.0.0
 */
public class HelmLanguage extends IgnoreLanguage {
    /** The {@link HelmLanguage} instance. */
    public static final HelmLanguage INSTANCE = new HelmLanguage();

    /** {@link IgnoreLanguage} is a non-instantiable static class. */
    private HelmLanguage() {
        super("Kubernetes Helm", "helmignore", null, Icons.HELM);
    }

    /**
     * Language file type.
     *
     * @return {@link HelmFileType} instance
     */
    @NotNull
    @Override
    public IgnoreFileType getFileType() {
        return HelmFileType.INSTANCE;
    }

    /**
     * Language is related to the VCS.
     *
     * @return is VCS
     */
    @Override
    public boolean isVCS() {
        return false;
    }
}
