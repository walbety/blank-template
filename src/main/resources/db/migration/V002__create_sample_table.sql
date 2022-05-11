CREATE TABLE IF NOT EXISTS sample (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    sample_id varchar(13) not null,
    sample_value integer,
    created_at timestamp with time zone default current_timestamp not null
    );