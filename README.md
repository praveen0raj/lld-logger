LOGGER LIBRARY

Requirements
    • Client/application make use of your logger library to log messages to as sink
Message
    • has content which is of type string
    • has a level associated with it
    • is directed to a destination (sink)
    • has namespace associated with it to identify the part of application that sent the message
Sink
    This is the destination for a message (eg text file, database, console, etc
    • Sink is tied to one or more message level
    • one or more message level can have the same sink Logger library
    • Requires configuration during sink setup o Accepts messages from client(s)
        o Routes messages to appropriate sink based on the level
        o Supports following message level in the order of pronty: FATAL, ERROR WARN, INFO, DEBUG • Message levels above            a given message level should be logged
    • Ex If INFO is configured as a message level, FATAL, ERROR, WARN and INFO should be logged
    • Enriches message with additional information (like timestamp) while directing message to a sink

Sending messages
    • Sink need not be mentioned while sending a message to the logger library
    • A message level is tied to a sink.
    • You specify message content level and namespace while sending a message

Logger configuration (see sample below)
    • Specifies all the details required to use the logger library
    • Library can accept one or more configuration for an application
        o One configuration per association of message level and sink
    • You may consider logger configuration as a key-value pair Example:
        o time format o logging level o sink type
        o details required for sink (eg file location))
