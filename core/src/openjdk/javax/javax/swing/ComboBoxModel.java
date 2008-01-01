/*
 * Copyright 1997-2000 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
package javax.swing;

/**
 * A data model for a combo box. This interface extends <code>ListDataModel</code>
 * and adds the concept of a <i>selected item</i>. The selected item is generally
 * the item which is visible in the combo box display area.
 * <p>
 * The selected item may not necessarily be managed by the underlying 
 * <code>ListModel</code>. This disjoint behavior allows for the temporary 
 * storage and retrieval of a selected item in the model.
 *
 * @version 1.22 05/05/07
 * @author Arnaud Weber
 */
public interface ComboBoxModel extends ListModel {

  /** 
   * Set the selected item. The implementation of this  method should notify 
   * all registered <code>ListDataListener</code>s that the contents 
   * have changed. 
   * 
   * @param anItem the list object to select or <code>null</code> 
   *        to clear the selection
   */
  void setSelectedItem(Object anItem);

  /** 
   * Returns the selected item 
   * @return The selected item or <code>null</code> if there is no selection
   */
  Object getSelectedItem();
}
