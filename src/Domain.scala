import java.time.LocalDate
import java.time.Duration

enum TagType:
    case Label, Area, Contact

case class Tag(name: String, tagType: TagType)

enum GTDList:
    case Inbox, Next, Someday, Waiting, Scheduled

enum Energy:
    case Low, Medium, High

opaque type Note = String

case class Project(
    name: String,
    tags: Set[Tag],
    list: GTDList,
    note: Note,
)

case class Item(
    name: String,
    tags: Set[Tag],
    list: GTDList,
    note: Note,
    duration: Duration,
    energy: Energy,
    dueDate: LocalDate,
    project: Option[Project]
)