/**
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.tree;

import java.io.File;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.python.pydev.shared_core.image.IImageCache;
import org.python.pydev.shared_core.image.UIConstants;
import org.python.pydev.shared_ui.ImageCache;
import org.python.pydev.shared_ui.SharedUiPlugin;

public class FileTreeLabelProvider extends LabelProvider {

    private IImageCache imageCache;

    /**
     *
     */
    public FileTreeLabelProvider() {
        imageCache = SharedUiPlugin.getImageCache();
    }

    @Override
    public String getText(Object element) {
        return ((File) element).getName();
    }

    @Override
    public Image getImage(Object element) {
        if (((File) element).isDirectory()) {
            return ImageCache.asImage(imageCache.get(UIConstants.FOLDER_ICON));
        } else {
            return ImageCache.asImage(imageCache.get(UIConstants.FILE_ICON));
        }
    }
}