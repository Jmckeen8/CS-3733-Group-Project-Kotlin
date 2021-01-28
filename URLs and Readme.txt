Create Choice page: https://cs3733b20kotlin.s3.us-east-2.amazonaws.com/html/index.html?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20201211T201920Z&X-Amz-SignedHeaders=host&X-Amz-Expires=604796&X-Amz-Credential=AKIAIR54JS5TESQ2RC7Q%2F20201211%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Signature=194b2a3f86335aecb89480feea03ef0807440b67bb48da8b972952cd778cc467
Admin Console: https://cs3733b20kotlin.s3.us-east-2.amazonaws.com/html/adminConsole.html?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20201211T201932Z&X-Amz-SignedHeaders=host&X-Amz-Expires=604797&X-Amz-Credential=AKIAIR54JS5TESQ2RC7Q%2F20201211%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Signature=920f3e092253127987b684e36f2496d68ebfdd4107083965859fd92fecfaa773

README:
 - To add an approval/disapproval, click the buttons with the up or down arrows. The button will turn green or red to indicate the approval/disapproval has been added, and the number next to the button will indicate the new number of approvals/disapprovals for that alternative
 - To see the list of users who have approved or disapproved an alternative, hover your mouse cursor over the approve/disapprove button or number, and a list of users will show up on the right side of the screen.
 - To remove an approval/disapproval, click the approval or disapproval button again. The button will revert back to gray and the number will change reflecting the removal of the approval or disapproval.
 - If a user clicks "approve" for an alternative they have previously disapproved (or vice-versa) the approval will be removed and and a disapproval will be added. This ensures no user can approve and disapprove the same alternative at the same time.

 - To view feedback or leave feedback for an alternative, lick the "View/Leave Feedback" button. The button will turn gold indicating you're viewing feedback for that alternative.
 - A text box will be presented to write feedback to submit, and below this box is a list of all previous feedback left for that alternative with the username and timestamp.

 - To complete a choice, click the "complete choice" button for an alternative. This will disable the approval and disapproval buttons for each altnerative, the "submit" button for feedback, and "complete choice" button for all the alternatives.
 - Any users with a stale page when a choice has been completed will be presented with an error if they try to add approvals, disapprovals, or feedback.
 - NOTE: because of quirks with disabling buttons in HTML, the mouse rollover functionalty to view the usernames for approvals and disapprovals will only work on the number, not the button itself after a choice has been completed.

 - Creating a choice may take a few seconds after clicking "create choice" to redirect to viewing the new choice.
 - Generating the choice report in the admin console may take a few seconds after the initial page load.