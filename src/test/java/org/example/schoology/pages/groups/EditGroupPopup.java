package org.example.schoology.pages.groups;

import java.util.Map;

public class EditGroupPopup extends AbstractGroupPopup {

    public Groups edit(final Map<GroupForm, String> groupMap) {
        fill(groupMap);
        submitButton.click();
        return new Groups();
    }
}
